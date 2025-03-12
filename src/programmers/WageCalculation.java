package programmers;

/**
 * 당신은 근로자의 한달동안의 근로시간 기록과 시간당 급여를 입력받아 근로자가 받아야할 한달 임금을 알려주려고 합니다.
 * 임금은 기본 수당, 연장 수당, 야간 수당, 주말 수당, 주휴 수당을 합친 값 입니다.
 *
 * 기본수당: 1시간 근무할 때마다 시간당 급여를 지급받습니다.
 * 연장수당: 하루에 8시간을 초과해서 근무하는 경우 초과시간만큼 시간당 급여의 0.5배를 추가로 지급받습니다.
 * 주말수당: 주말에 근무하는 경우 시간당 급여의 0.5배를 추가로 지급받습니다.
 * 주휴수당: 일주일에 15시간 이상 근무하는 경우 일주일 총 근무시간만큼 시간당 급여의 0.2배를 추가로 지급받습니다.
 * 순서대로 연속된 월화수목금토일을 일주일로 정의합니다.
 * 이번달 마지막 주 주휴수당은 이번달 임금에 포함되지 않습니다. 이번달 1일은 월요일입니다.
 *
 * 문제 접근 방법
 * 1. 하루 단위로 쪼개기
 * 2. 매일 일한 시간 모으기
 * 3. 특별한 시간 계산하기
 * 4. 모든 수당 더하기
 *
 * 시뮬레이션 알고리즘
 *
 */
public class WageCalculation {
    public int solution(int[][] works, int wage) {
        // 한 달은 31일
        int monthLength = 31;

        // 1일부터 31일까지 각 날짜별 일한 시간을 저장할 배열
        int[] dailyWorkHours = new int[monthLength + 1];

        // 밤에 일한 시간(22시~24시까지)을 모두 더해놓을 변수
        int totalNightHours = 0;

        // 모든 근무기록을 확인
        for (int[] work : works) {
            // work 배열의 각 원소는 [시작일, 시작시간, 종료일, 종료시간]을 의미
            int startDay = work[0];
            int startTime = work[1];
            int endDay = work[2];
            int endTime = work[3];

            // 만약 종료일이 32라면 이는 다음달 1일 0시 (31일 24시)로 바꿔줌
            if (endDay == 32) {
                endDay = monthLength;
                endTime = 24;
            }

            // 시작일부터 종료일까지 하루씩 반복
            for (int day = startDay; day <= endDay; day++) {
                // 오늘이 시작하는 날이면 시작시간은 work의 시작시간, 그렇지않으면 0시부터 시작
                int segmentStartTime = (day == startDay) ? startTime : 0;
                // 오늘이 끝나는 날이면 종료시간은 work의 종료시간, 그렇지않으면 24시까지 일했다고 가정
                int segmentEndTime = (day == endDay) ? endTime : 24;

                // 오늘 일한 시간을 구함
                int duration = segmentEndTime - segmentStartTime;

                // 해당 날짜에 오늘 일한 시간을 더함
                dailyWorkHours[day] += duration;

                // 야간 근무 시간 계산: 22시부터 24시까지 일한 시간을 구함
                int nightSegmentStart = Math.max(segmentStartTime, 22);
                int nightSegmentEnd = Math.min(segmentEndTime, 24);

                // 만약 야간 근무 시간이 있다면
                if (nightSegmentEnd > nightSegmentStart) {
                    // 야간 근무 시간 누적
                    totalNightHours += (nightSegmentEnd - nightSegmentStart);
                }
            }
        }

        // 기본 수당 : 전체 일한 시간 * 시급
        int basicPay = 0;
        for (int day = 1; day <= monthLength; day++) {
            basicPay += dailyWorkHours[day] * wage;
        }

        // 연장 수당: 하루에 8시간 넘게 일하면 초과하는 시간마다 시급의 0.5배를 추가
        int overtimePay = 0;
        for (int day = 1; day <= monthLength; day++) {
            if (dailyWorkHours[day] > 8) {
                int extraHours = dailyWorkHours[day] - 8;
                overtimePay += (int) (extraHours * wage * 0.5);
            }
        }

        // 야간 수당: 누적된 야간 근무 시간에 대해 시급의 0.5배 추가
        int nightPay = (int) (totalNightHours * wage * 0.5);

        // 주말 수당: 토요일과 일요일에 일한 시간에 대해 시급의 0.5배를 추가
        // 1일이 월요일이므로 (day - 1) % 7가 5면 토요일, 6이면 일요일
        int weekendPay = 0;
        for (int day = 1; day <= monthLength; day++) {
            int dayOfWeek = (day - 1) % 7;
            if (dayOfWeek == 5 || dayOfWeek == 6) {
                weekendPay += (int) (dailyWorkHours[day] * wage * 0.5);
            }
        }

        // 주휴 수당: 완전한 주(월~일)가 있을 때 그 주의 총 일한 시간이 15시간 이상이면 그 주에 일한 전체 시간에 대해 시급의 0.2배를 추가
        int weeklyBonus = 0;
        int completeWeeks = monthLength / 7;
        for (int week = 0; week < completeWeeks; week++) {
            int weekTotalHours = 0;
            // 각 주의 시작일과 끝일 (1~7일, 8~14일 등)
            for (int day = week * 7 + 1; day <= week * 7 + 7; day++) {
                weekTotalHours += dailyWorkHours[day];
            }
            if (weekTotalHours >= 15) {
                weeklyBonus += (int) (weekTotalHours * wage * 0.2);
            }
        }

        int totalPay = basicPay + overtimePay + nightPay + weekendPay + weeklyBonus;
        return totalPay;
    }

    public static void main(String[] args) {
        WageCalculation calc = new WageCalculation();

        int[][] works1 = { {1, 8, 1, 13}, {5, 18, 6, 9} };
        int wage1 = 10000;
        int result1 = calc.solution(works1, wage1);
        System.out.println(result1);
    }
}
