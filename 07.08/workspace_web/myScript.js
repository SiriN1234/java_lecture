function changeColor(){
    // 바꿀 요소를 선택
    let ele = document.getElementById("lorem1");

    // 그 요소의 style에 접근
    // 색을 바꾸기
    ele.style.color = "black";
    
}

function changeManyColor(){

    let eleList = document.getElementsByTagName("div");

    for(let i = 0; i < 3; i++) {
        eleList[i].style.color = "skyblue";
    }

}


function changeSize(){

    let eleList = document.getElementsByClassName("halfImg");

    console.log(eleList);
    console.log(typeof(eleList));

    eleList[0].height *= 0.5;
}


function deleteDom(){
    let imgEle = document.getElementById("myImg");
    // let parent = document.getElementsByTagName("body")[0];
    
    // parent.removeChild(imgEle);
    // document.body.removeChild(imgEle);
    imgEle.remove();
}


function centerAlign(){

    let imgEle = document.getElementById("divCenter");
    
    imgEle.style.display = "flex";
    imgEle.style.justifyContent = "center";
}