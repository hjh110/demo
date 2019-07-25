

/*
var hidden =$("#offsetTop").attr("class");
//scroll 鼠标滑动事件
var offsetTop=$("."+hidden).offset();

console.log(offsetTop.top)
//这是当前滚动条的位置
var scroll=$(window).scrollTop()
*/

$(window).scroll(()=>{
    var hidden=$("#offsetTop").attr("class");
//scroll 鼠标滑动事件
    var offsetTop=$("."+hidden).offset().top;

    var scroll=$(window).scrollTop()

    //获取 id="course_container" 元素，offsetTop是当前元素·距离网页窗口顶部的距离
    if (scroll<=offsetTop){
        $(".AppHeader").attr("class","Sticky AppHeader is-fixed");
    }
    if (scroll>offsetTop){
        $(".AppHeader").attr("class","Sticky AppHeader is-fixed is-hidden");
    }



    if (scroll>offsetTop){
        $(".PageHeader").attr("class","PageHeader is-shown");
    }
    if (scroll<=offsetTop){
        $(".PageHeader").attr("class","PageHeader");
    }
    /*$("#PageHeader").toggleClass("PageHeader is-shown",scroll>100);

    $("#PageHeader").toggleClass("PageHeader",scroll<=100);*/


})
