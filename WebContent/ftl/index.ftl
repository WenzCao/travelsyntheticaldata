<#import "macro/component.ftl" as componentTag/>
<html>
    <@componentTag.head 'Platform Login'/>
    <body>
        <div class="main-wrapper">
            <div class="app" id="app">
                <@componentTag.header 'Platform Login'/>
                <@componentTag.aside/>
                <article class="content dashboard-page">

                </article>
                <@componentTag.footer/>
            </div>
        </div>
        <!-- Reference block for JS
        <div class="ref" id="ref">
            <div class="color-primary"></div>
            <div class="chart">
                <div class="color-primary"></div>
                <div class="color-secondary"></div>
            </div>
        </div>
        -->
        <@componentTag.javascript/>
    </body>
</html>