<#import "macro/ui.ftl" as uiTag/>
<html>
    <head>
        <meta http-equiv="Content-Type" Content="text/html;Charset=utf8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title> ModularAdmin - Free Dashboard Theme | HTML Version </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <!-- Place favicon.ico in the root directory -->
        <link rel="stylesheet" href="css/vendor.css">
        <!-- Theme initialization -->
        <script>
            var themeSettings = (localStorage.getItem('themeSettings')) ? JSON.parse(localStorage.getItem('themeSettings')) :
            {};
            var themeName = themeSettings.themeName || '';
            if (themeName)
            {
                document.write('<link rel="stylesheet" id="theme-style" href="css/app-' + themeName + '.css">');
            }
            else
            {
                document.write('<link rel="stylesheet" id="theme-style" href="css/app.css">');
            }
        </script>
    </head>
    <body>
        <div class="auth">
            <div class="auth-container">
                <div class="card">
                    <header class="auth-header">
                        <h1 class="auth-title">
                                               旅游综合数据管理平台 </h1>
                    </header>
                    <div class="auth-content">
                        <p class="text-center" style="font-size: 22px">登录平台，漫游数据</p>
                        <form id="login-form" action="/index.html" method="GET" novalidate="">
                        	<@uiTag.input 'username','text','用户名','username','Your email address'/>
                        	<@uiTag.input 'password','password','密码','password','Your password'/>
                            <div class="form-group">
                                <label for="remember">
                                    <input class="checkbox" id="remember" type="checkbox">
                                    <span>Remember me</span>
                                </label>
                                <p class="forgot-btn pull-right">忘记密码?请联系管理员</p>
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-block btn-primary">登录</button>
                            </div>
                        </form>
                    </div>
                    <footer style="background-color: #f6f6f6; height: 58px; border-top: 1px solid #ebebeb; padding-top: 16px;">
                    	<p class="text-muted text-center">没有账号?请联系管理员</p>
                    </footer>
                </div>
            </div>
        </div>
        <!-- Reference block for JS -->
        <div class="ref" id="ref">
            <div class="color-primary"></div>
            <div class="chart">
                <div class="color-primary"></div>
                <div class="color-secondary"></div>
            </div>
        </div>
        <script src="js/vendor.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>