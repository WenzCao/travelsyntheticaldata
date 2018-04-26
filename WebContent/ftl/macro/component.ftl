<#macro head title> 
	<head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title> ${title} </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <!-- Place favicon.ico in the root directory -->
        <link rel="stylesheet" href="css/vendor.css">
        <!-- nested -->
        <#nested>
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
</#macro>

<#macro header username> 
	<header class="header">
        <div class="header-block header-block-collapse d-lg-none d-xl-none">
            <button class="collapse-btn" id="sidebar-collapse-btn">
                <i class="fa fa-bars"></i>
            </button>
        </div>
        <div class="header-block header-block-search">
            <form role="search">
                <div class="input-container">
                    <i class="fa fa-search"></i>
                    <input type="search" placeholder="Search">
                    <div class="underline"></div>
                </div>
            </form>
        </div>
        <div class="header-block header-block-nav">
            <ul class="nav-profile">
                <li class="notifications new">
                    <a href="" data-toggle="dropdown">
                        <i class="fa fa-bell-o"></i>
                        <sup>
                            <span class="counter">8</span>
                        </sup>
                    </a>
                    <div class="dropdown-menu notifications-dropdown-menu">
                        <ul class="notifications-container">
                        </ul>
                        <footer>
                            <ul>
                                <li>
                                    <a href=""> View All </a>
                                </li>
                            </ul>
                        </footer>
                    </div>
                </li>
                <li class="profile dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                        <div class="img" style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&s=40')"> </div>
                        <span class="name"> ${username} </span>
                    </a>
                    <div class="dropdown-menu profile-dropdown-menu" aria-labelledby="dropdownMenu1">
                        <a class="dropdown-item" href="#">
                            <i class="fa fa-user icon"></i> 用户信息 </a>
                        <a class="dropdown-item" href="#">
                            <i class="fa fa-bell icon"></i> 平台通知 </a>
                        <a class="dropdown-item" href="#">
                            <i class="fa fa-gear icon"></i> 设置 </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="login.html">
                            <i class="fa fa-power-off icon"></i> 退出系统 </a>
                    </div>
                </li>
            </ul>
        </div>
    </header>
</#macro>

<#macro aside>
	<aside class="sidebar">
        <div class="sidebar-container">
            <div class="sidebar-header">
                <div class="brand">
                    <div class="logo">
                        <span class="l l1"></span>
                        <span class="l l2"></span>
                        <span class="l l3"></span>
                        <span class="l l4"></span>
                        <span class="l l5"></span>
                    </div> Modular Admin </div>
            </div>
            <nav class="menu">
                <ul class="sidebar-menu metismenu" id="sidebar-menu">
                    <li class="active">
                        <a href="index.action">
                            <i class="fa fa-home"></i> 平台首页 </a>
                    </li>
                    <li>
                        <a href="screenful.html">
                            <i class="fa fa-bar-chart"></i> 数据漫游
                        </a>
                    </li>
                    <li>
                        <a href="">
                            <i class="fa fa-th-large"></i> 爬虫任务管理
                        </a>
                    </li>
                    <li>
                        <a href="">
                            <i class="fa fa-table"></i> 爬虫数据库
                            <i class="fa arrow"></i>
                        </a>
                        <ul class="sidebar-nav">
                            <li>
                                <a href="#"> 孤独星球 </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
        <footer class="sidebar-footer">
            <ul class="sidebar-menu metismenu" id="customize-menu">
                <li>
                    <ul>
                        <li class="customize">
                            <div class="customize-item">
                                <div class="row customize-header">
                                    <div class="col-4"> </div>
                                    <div class="col-4">
                                        <label class="title">fixed</label>
                                    </div>
                                    <div class="col-4">
                                        <label class="title">static</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-4">
                                        <label class="title">Sidebar:</label>
                                    </div>
                                    <div class="col-4">
                                        <label>
                                            <input class="radio" type="radio" name="sidebarPosition" value="sidebar-fixed">
                                            <span></span>
                                        </label>
                                    </div>
                                    <div class="col-4">
                                        <label>
                                            <input class="radio" type="radio" name="sidebarPosition" value="">
                                            <span></span>
                                        </label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-4">
                                        <label class="title">Header:</label>
                                    </div>
                                    <div class="col-4">
                                        <label>
                                            <input class="radio" type="radio" name="headerPosition" value="header-fixed">
                                            <span></span>
                                        </label>
                                    </div>
                                    <div class="col-4">
                                        <label>
                                            <input class="radio" type="radio" name="headerPosition" value="">
                                            <span></span>
                                        </label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-4">
                                        <label class="title">Footer:</label>
                                    </div>
                                    <div class="col-4">
                                        <label>
                                            <input class="radio" type="radio" name="footerPosition" value="footer-fixed">
                                            <span></span>
                                        </label>
                                    </div>
                                    <div class="col-4">
                                        <label>
                                            <input class="radio" type="radio" name="footerPosition" value="">
                                            <span></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="customize-item">
                                <ul class="customize-colors">
                                    <li>
                                        <span class="color-item color-red" data-theme="red"></span>
                                    </li>
                                    <li>
                                        <span class="color-item color-orange" data-theme="orange"></span>
                                    </li>
                                    <li>
                                        <span class="color-item color-green active" data-theme=""></span>
                                    </li>
                                    <li>
                                        <span class="color-item color-seagreen" data-theme="seagreen"></span>
                                    </li>
                                    <li>
                                        <span class="color-item color-blue" data-theme="blue"></span>
                                    </li>
                                    <li>
                                        <span class="color-item color-purple" data-theme="purple"></span>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                    <a href="">
                        <i class="fa fa-cog"></i> Customize </a>
                </li>
            </ul>
        </footer>
    </aside>
    <div class="sidebar-overlay" id="sidebar-overlay"></div>
    <div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
    <div class="mobile-menu-handle"></div>
</#macro>

<#macro footer>
	<footer class="footer">
        <div class="footer-block buttons">
            <!--<iframe class="footer-github-btn" src="https://ghbtns.com/github-btn.html?user=modularcode&repo=modular-admin-html&type=star&count=true" frameborder="0" scrolling="0" width="140px" height="20px"></iframe>-->
        </div>
        <div class="footer-block author">
            <ul>
                <li> created by
                    <a href="https://github.com/modularcode">Coder</a>
                </li>
                <li>
                    <a href="#">详细信息</a>
                </li>
            </ul>
        </div>
    </footer>
</#macro>

<#macro javascript>
	<script src="js/vendor.js"></script>
	<script src="js/app.js"></script>
	<#nested>
</#macro>