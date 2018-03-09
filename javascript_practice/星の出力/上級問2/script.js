document.write("ココカラ----------");

document.write("<br>");

for(a=0;a<=4;a++){
    for(b=a;b<=a+4;b++){
        if(b%2 == 0){
            document.write("★");
        }
        else{
            document.write("☆");
        }
    }
    document.write("<br>");
}

document.write("----------ココマデ");