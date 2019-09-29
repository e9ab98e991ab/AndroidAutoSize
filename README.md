# **AndroidAutoSize** 0.7.0 + 1.1.2 综合版本

本项目是解决低版本适配问题  解决 [#32错误](https://github.com/JessYanCoding/AndroidAutoSize/issues/32)

不包含

```
FragmentManager.FragmentLifecycleCallbacks
```

在AutoSize 0.7.0 的基础上  去掉了 fragment 适配 


使用 AutoSizeCompat 类，使用以下代码即可解决所有屏幕适配失效的问题

```
@Override
public Resources getResources() {
//如果没有自定义需求用这个方法
AutoSizeCompat.autoConvertDensityOfGlobal((super.getResources());
//如果有自定义需求就用这个方法
AutoSizeCompat.autoConvertDensity((super.getResources(), 667, false);
return super.getResources();
}
AutoSizeConfig.getInstance().setExcludeFontScale(true); 一行代码即可实现 App 内的字体大小不跟随系统设置中字体大小的改
```





`注意：` 本项目是LIbrary 请使用 Module 方式导入项目使用