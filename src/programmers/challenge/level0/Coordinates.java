package programmers.challenge.level0;

/**
 * title: 캐릭터의 좌표
 * date: 2024.11.24
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120861
 * description: 머쓱이는 RPG 게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가 있으며
 * 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 예를 들어 [0,0]에서 up을 누른다면
 * 캐릭터의 좌표는 [0,1], down을 누른다면 [0,-1], left를 누른다면 [-1,0], right를 누른다면
 * [1,0] 입니다. 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
 * 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x,y]를 return 하도록
 * solution 함수를 완성해주세요.
 *
 * [0,0]은 board의 정중앙에 위치합니다. 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4,0]까지
 * 오른쪽으로 최대 [4,0]까지 이동할 수 있습니다.
 */
public class Coordinates {
    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        int[] answer = solution(keyinput, board);

        for (int i = 0; i < answer.length; i++) {
            System.out.println("x: " + answer[0]);
            System.out.println("y: " + answer[1]);
        }
    }

    private static int[] solution(String[] keyinput, int[] board) {
        GameBoard gameBoard = new GameBoard(board);
        return gameBoard.calculateCoordinates(keyinput);
    }
}

class GameBoard {
    private final int xLimit;
    private final int yLimit;

    public GameBoard(int[] board) {
        this.xLimit = board[0] / 2;
        this.yLimit = board[1] / 2;
    }

    public int[] calculateCoordinates(String[] keyinput) {
        Position position = new Position();

        for (String direction : keyinput) {
            position.move(direction, xLimit, yLimit);
        }

        return position.getCoordinates();
    }
}

class Position {
    private int x;
    private int y;

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public void move(String direction, int xLimit, int yLimit) {
        switch (direction) {
            case "up":
                if (y < yLimit) y++;
                break;
            case "down":
                if (y > -yLimit) y--;
                break;
            case "left":
                if (x > -xLimit) x--;
                break;
            case "right":
                if (x < xLimit) x++;
                break;
        }
    }

    public int[] getCoordinates() {
        return new int[] {x, y};
    }
}