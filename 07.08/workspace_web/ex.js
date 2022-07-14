function digits(num){
    let i = 1;
    let inputNum = num;
    for(;;){
        if(inputNum/10 >= 1){
            i++;
            inputNum /= 10;
        } else
            break;
    }

    return i;
}

function digits2(num){
    let str = '' + num;
    return str.length;
}


function printSquared(arr){
    
    for(let num of arr){
        console.log(num * num);
    }
    // in을 쓰면 인덱스(key)를 반환
    // of를 쓰면 값(value)를 반환
}