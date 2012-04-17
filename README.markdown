Simplified DateSlider is a ready-to-use modification of DateSlider (https://github.com/bendemboski/DateSlider). As I found that the original package is a bit hard to integrate to my existing project, I tried to extract the necessary files and simplify their structure so that it will be easy to include. This repo follows the original DateSlider license (Apache License 2.0).


### Adding Simplified DateSlider to your project (Automatic)
if you had ruby installed on your machine, browse to Simplified DateSlider's folder. Then use the following command
```
  ruby install.rb [your package name] [your project path]
```

For example, ruby install.rb com.example ~/Projects/eclipse/workspace/my_project

### Adding Simplified DateSlider to your project (Manual)
1. Copy the code in src folder to your src folder. If you wanted to change the package name, go ahead!
2. Copy attrs.xml and styles.xml to your res/values folder. If you had them already, copied the content of these files and pasted into yours.
3. Copy all files in res/drawable to your res/drawable folder.
4. Copy all files in res/layout to your res/layout folder.
5. Clean up the project (assumed that you are using Eclipse), some files will show errors.
6. Import your R class in those files.


### How to use it?
See DateSlider's original repo at https://github.com/bendemboski/DateSlider.


Note: DateSlider use custom attribute as defined in attrs.xml. However, I could not get the original version working according to this issue (http://stackoverflow.com/questions/2695646/declaring-a-custom-android-ui-element-using-xml), so I fixed it.