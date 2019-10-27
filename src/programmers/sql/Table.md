### SQL 문제 풀이에 사용되는 테이블 정보

> ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다.
ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE,
DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE 는 각각 동물의 아이디,
생물종, 보호 시작일, 보호 시작시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.


### 테이블 구조

>
NAME					TYPE			NULLABLE
ANIMAL_ID			VARCHAR(N)	FALSE
ANIMAL_TYPE			VARCHAR(N)	FALSE
DATETIME				DATETIME		FALSE
INTAKE_CONDITION		VARCHAR(N)	FALSE
NAME					VARCHAR(N)	TRUE
SEX_UPON_INTAKE		VARCHAR(N)	FALSE