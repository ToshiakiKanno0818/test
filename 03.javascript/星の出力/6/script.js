document.write("ココカラ----------");

document.write("<br>")

for(a=0;a<=2;a++){
    for(b=0;b<=2;b++){
        if(b%2==0){
            document.write("★")
        }
        else{
            document.write("☆")
        }
    }
    document.write("<br>")
}

document.write("----------ココマデ");