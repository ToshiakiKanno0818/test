<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
	<link rel="text/javascript" href="${pageContext.request.contextPath}/js/modal.js">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
    <script src="js/modal.js"></script>

	<title>home</title>

    <script>
        $(document).ready(function(){
            $('.slider').bxSlider({
                auto:true,
                mode:"fade",
                speed:2000,
                SlideWidth:400
            });
        });
    </script>

</head>
<body>
		<header>
            <ul class="inner">
                <li>Top</li>
                <li>Works</li>
                <li><a href='<s:url action="GoProductsAllAction" />'>Oniline Store</a></li>
                <li>About me</li>
                <li>Contact</li>
            </ul>
        </header>

		<!-- Mainコンテンツ -->
        <div class="main">
            <div class="contentsbox">
                <h1>News</h1>

                <!-- モーダルウィンドウを開くボタン -->
                <p><a href="#modal01" class="modalOpen"><img src="image/pic1.jpg"></a></p>

                <!-- モーダルウィンドウ -->
                <div class="modal" id="modal01">
                    <div class="overLay modalClose"></div>

                    <!-- モーダルウィンドウの中身 -->
                    <div class="modal-main">
                    </div>

                    <div class="modal-footer">
                        <a href="" class="modalClose">Close</a>
                    </div>

                </div>

            </div>


            <div class="contentsbox">
                <h1>Works</h1>
                <div class="slideframe">
                    <div class="slider">
                        <div>
                        	<script type="application/javascript" src="https://embed.nicovideo.jp/watch/sm32498801/script?w=640&h=360"></script><noscript><a href="http://www.nicovideo.jp/watch/sm32498801">【初音ミク】降りやまぬ雨に</a></noscript>
                            <!-- <img src="furiyamanu"> -->
                        </div>
                        <div>
                            <script type="application/javascript" src="https://embed.nicovideo.jp/watch/sm33010290/script?w=640&h=360"></script><noscript><a href="http://www.nicovideo.jp/watch/sm33010290">【初音ミク】微睡みの森は祈り溢れて</a></noscript>
                            <!-- <img src="madoromi"> -->
                        </div>
                    </div>
                </div>
            </div>

            <div id="modal-overlay"></div>
            <div class="contentsbox">
                <h1>Oniline Store</h1>
            </div>

            <div class="contentsbox">
                <h1>About me</h1>
            </div>

            <div class="contentsbox">
                <h1>Contact</h1>
            </div>

        </div>

        <!-- fotter 外部リンク（アイコン画像） -->
        <footer>
            <ul class="sns">
                <li>T</li>
                <li>N</li>
            </ul>

        </footer>


</body>
</html>