<!DOCTYPE html>
<heml lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>お問い合わせ</title>
        
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    
    <body>
        <h1>お問い合わせ内容確認</h1>
        
        <p>お問い合わせ内容はこちらでよろしいでしょうか？<br>
        よろしければ「送信する」ボタンを押してください。</p>
        
        <div class="confirm">
            
            <p>
                名前
                <br>
                <?php echo $_POST['name']; ?>
            </p>

            <p>
                メールアドレス
                <br>
                <?php echo $_POST['mail']; ?>
            </p>
                
            <p>
                年齢
                <br>
                <?php echo $_POST['age']; ?>
            </p>
                
            <p>
                コメント
                <br>
                <?php echo $_POST['comment']; ?>
            </p>
            
            <form action="index.html">     
                <div class="inputlist">
                    <input type="submit" class="button1" value="戻って修正する">
                </div>
            </form>
            
            <form action="insert.php" method="post">     
                <div class="inputlist">                   
                    <input type="submit" class="button2" value="送信する">
                    <input type="hidden" value="<?php echo $_POST['name'];?>" name="name">
                    <input type="hidden" value="<?php echo $_POST['mail'];?>" name="mail">
                    <input type="hidden" value="<?php echo $_POST['age'];?>" name="age">
                    <input type="hidden" value="<?php echo $_POST['comment'];?>" name="comment">
                </div>
            </form>            
        
        </div>        
    </body>
</heml>