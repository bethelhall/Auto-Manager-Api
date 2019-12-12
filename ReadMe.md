Project Name: 
          
          Beheer - Auto Manager

Project Overview

Beheer is an android platform that enables car companies to easily manage their cars.
Beheer enables managers to easily keep track of their cars.
The application is made for a skill test purpose and a supplement for an internship application.

Model View, ViewModel(MVVM) architeciture is used to build the application
Technologies used:
>>Firebase Authentication

>>Android JetPack components such as:

>>Room, LiveData, ConstraintLayout,ViewModel, DataBinding, AppCompat, Lifecycle,Fragments and Navigation 

>>Remote API built using Spring Boot

>>Retrofit 2.0


Configuration Instructions:

>>On Windows:
1. Please go to: https://github.com/bethelhall/auto-manager
and clone it into your machine.
2. To get the remote API, please go to: https://github.com/bethelhall/Auto-Manager-Api and clone it.
3. Open the API on Intellij IDEA. The go to application.properties to do these configurations:
>> spring.datasource.url = jdbc:mysql://localhost:3306/beheer
   spring.datasource.username = "Enter your username"
   spring.datasource.password = "Enter Your password"
   
4. create a mysql database and name it "beheer".

5. Now run the Spring API.(Go to BeheerApiApplication and run it)

6. Go to the android project you opened. Find the "ServiceBuilder" class under
data > remote directories. Please change the baseUrl to your local network IP address.

7. Run the project on your android phone. Please make sure that both your mobile's and the project's network is the same.

File Structure:

Traversing through src -> main -> java ->, you should find packages of:

>> 1.Repository(Repository classes)

>> 2.Adapter(Recycler Adapters)

>> 3.Data(local, remote and webservice)

>> 4.View(All Fragments)

>> 6.com.example.beheer -> ViewModel, NavigationHost and the MainActivity

>> 7.Res(All resource files including menus, values, layout and drawables)


Known Bugs:



Removing a list from the recycler view may not be observable.
 
 
Acknowledgment:

Thank you all of you for this opportunity to work with you.



