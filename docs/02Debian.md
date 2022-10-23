# Debian
<https://www.debian.org>

## 1. 安装
1. [官方文档](https://www.debian.org/releases/stable/debian-installer/)
2. 最低硬件要求：2个核心，1G内存
3. 测试账号：root/1q2w3e4r, drintau/1q2w3e4r
4. 初始只有vi，学习命令<https://blog.csdn.net/cyl101816/article/details/82026678>
5. 从光盘启动安装，安装界面选中文才知道要选什么（选英文可能选错了，系统都起不来），但这会导致安装好后控制台中文乱码，到时再设置一下。
6. 设置locales为英文，否则控制台出现中文乱码。<https://www.cnblogs.com/nihaorz/p/12069699.html>
7. 设置镜像源，用清华大学的。<https://mirrors.tuna.tsinghua.edu.cn/help/debian/>
8. 可以安装vim等软件了。`apt-get install vim`
9. 安装ssh（一开始安装时是可以选择安装的，当时没想到）`apt-get install ssh`，并设置。<https://www.cnblogs.com/zf29506564/p/5924764.html>、<https://www.cnblogs.com/liu-ke/p/14166097.html>

## 2. 桌面环境
现成的著名桌面环境：KDE（这个比较炫酷），GNOME，等等（百度搜就有很多）。  
Debian桌面环境介绍<https://wiki.debian.org/zh_CN/DesktopEnvironment>

## 3. 自定义桌面环境
参考：
1. <https://linux.cn/article-6441-1.html>
2. Debian文档：<https://wiki.debian.org/zh_CN/FrontPage?action=show&redirect=%E9%A6%96%E9%A1%B5>
3. ArchLinux文档：<https://wiki.archlinux.org/index.php/Desktop_environment_(%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87)>
4. ArchLinux各种组件介绍：<https://wiki.archlinux.org/index.php/List_of_applications_(%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87)#%E5%85%B6%E5%AE%83_2>

### 3.1 WindowManager 窗口管理器
OpenBox选了这个。<https://wiki.debian.org/Openbox>  
还有其他看官网介绍吧。

### 3.2 X Window System
安装后运行startx就可以进入openbox了。  
百度搜怎么安装吧。

### 3.3 Display Manager 显示管理器
LightDM选了这个。  
安装完就可以直接进入到图形登录界面，不用在命令行运行startx。  
还有其他看官网介绍吧。

### 3.4 Taskbars / panels / docks 任务栏面板
tint2就有任务栏了。  
还有其他看官网介绍

### 3.5 File Manager 文件管理器
PCManFM选了这个，这个官网就是LXDE官网里的一部分。  
还有其他百度吧。  
Xfe官网要翻墙（看不到介绍了），不过debian软件库不翻墙还是可以直接下载安装的。

### 3.6 自带的终端命令行字小中文乱码
1. <https://blog.csdn.net/bocai_xiaodaidai/article/details/99639058>
2. <https://blog.csdn.net/noctur_kaiser/article/details/105171513>
3. 中文乱码：安装字体，支持中文的就可以。  
4. Debian文档：<https://wiki.debian.org/Fonts>，随便选。
5. 选择性安装字体管理器。

### 3.7 浏览器
Firefox选了这个。Chrome装不上。Chromium有坑。

### 3.8 输入法
好像就搜狗比较出名。

### 3.9 清理与监控软件
1. https://linux.cn/article-5864-1-rel.html
2. https://www.howtoing.com/ccleaner-alternatives-for-ubuntu
3. BleachBit这个比较正规，在软件库可以下载到，用了这个。
4. Stacer软件库没有，照着github官网安装很简单，很炫酷。
5. 360 for Linux凉了，第一个试的就是这个，安装不上。