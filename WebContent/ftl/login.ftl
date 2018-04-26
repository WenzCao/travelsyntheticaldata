<#import "macro/ui.ftl" as uiTag/>
<#import "macro/component.ftl" as componentTag/>
<html>
    <@componentTag.head 'Platform Login'/>
    <body>
        <div class="auth">
            <div class="auth-container">
                <div class="card">
                    <header class="auth-header">
                        <h1 class="auth-title">
                                               旅游综合数据管理平台
                        </h1>
                    </header>
                    <div class="auth-content">
                        <p class="text-center" style="font-size: 22px">登录平台，漫游数据</p>
                        <form id="login-form" action="login.action" method="POST" novalidate="">
                        	<@uiTag.input 'username','text','用户名','username','Your email address'/>
                        	<@uiTag.input 'password','password','密码','password','Your password'/>
                            <div class="form-group">
                                <label for="remember">
                                    <input class="checkbox" id="remember" type="checkbox">
                                    <span>Remember me</span>
                                </label>
                                <p class="forgot-btn pull-right">忘记密码?请联系管理员</p>
                            </div>
                            <@uiTag.button '','submit','登录','',''/>
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