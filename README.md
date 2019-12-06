# Checklist
It is an android app to check a list of things to do

#### How to use as an user
This app allows users to add items in a list by adding 
Once completed one item, a user can delete the item by clicking on the item.

#### How to install and test run
***Option1*** A .apk file is formed under /Checklist/CheckList/app/release/. It can be installed on an Android device.
***Option2*** It can also be run on Android Studio and use choose a device under SDK manager. Pixel 3 was initially chosen for test runs. However, it should run on many other android devices.

#### Local Tests
Assume start the app with adding these two items into list, shown as follow:
![alt text](https://github.com/YangHuNU/Checklist/raw/master/Screenshots/ListToDo.PNG "Start")

Delete one item and added two, now the app looks like this:
![alt text](https://github.com/YangHuNU/Checklist/raw/master/Screenshots/ListToDo_afterModified.PNG "Modified")

#### AWS Tests

The AWS tests were run on with a test type of Build-in: Fuzz.

Five different devices passed with 3 tests each.
![alt text](https://github.com/YangHuNU/Checklist/raw/master/Screenshots/AWS_Test_Result.PNG "AWS Result")

Here are sample screenshots from some devices:
Pixel:
![alt text](https://github.com/YangHuNU/Checklist/raw/master/Screenshots/Pixel_ScreenShots.PNG "Pixel")

Galaxy 6:
![alt text](https://github.com/YangHuNU/Checklist/raw/master/Screenshots/Samsung_ScreenShots.PNG "Galaxy6")

Pixel 2:
![alt text](https://github.com/YangHuNU/Checklist/raw/master/Screenshots/Pixel2_ScreenShots.PNG "Pixel2")

#### Reference
The app is made by following [the tutorial video](https://www.youtube.com/watch?v=YmRPIGFftp0&t=258s) with my own customization. 
In the video, the original app doesn't store any delete actions into a seperate file. Therefore, once the app is closed and reopened, any deleted items will show up again. I fixed the problem in my own code.



