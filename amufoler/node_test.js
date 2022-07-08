/*
함수명 : printDan
인자 : 1개, 출력할 단
아웃풋 : 없음
본문 : 인자로 받은 한 단만 구구단 출력할 단
*/

function printDan(dan){
    for(let i = 0; i < 9; i++){
        console.log(`${dan} * ${i + 1} = ${dan * (i + 1)}`);
        // 템플릿 리터럴
    }
    console.log(``);
}

printDan(4);

/*
위에서 만들었던 printDan 함수를 재활용하여 구구단 전체를 출력하는 함수
printGugudan을 만들자
단, 각 단끼리는 한 줄을 띄워라
*/

function printGugudan(){
    debugger;
    for(let i = 1; i < 10; i++){
        printDan(i);
        console.log(``);
    }
}

printGugudan();


// 숫자를 하나 입력 받아서 홀수면 true, 짝수면 false를 리턴하는 isOdd
function isOdd(num){
    if(num % 2 == 1){
        return console.log(`홀수입니다`);
    }
    else{
        return console.log(`짝수입니다`);
    }
}

isOdd(999999);