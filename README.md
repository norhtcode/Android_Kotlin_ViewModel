# Android_Kotlin_ViewModel

An Android Jetpack ViewModle Tutorial.

"The main activity provides an empty container (main_activity.xml) space in form of a FrameLayout, in which content will appear.
The FrameLayout container is just a placeholder which will be replaced at runtime by the content of the first screen that is to appear when the app launches. This content will typically take the form of a Fragment (main_fragment.xml)."


## Description
### MainActivity
The main activity has been structured so as to allow a single activity to act as a container for all of the screens, in form of layouts, that will eventually be needed in the app.
Replaces the FrameLayout placeholder with a fragment, by replacing the object with the ide of container, with the MainFragment.


### MainFragment
The code that accompanies the main_fragment.xml.

**onCreateView()**
Method which is called when the fragment is created, and inflates the main_fragment.xml layout file, so that it is displayed within the container area of the main activity layout (main_activity.xml)

**onActivityCreated()**
Fragment or Activity maintain references to the ViewModels on which it relies for data using an instance of the ViewModelProvider class. 
A ViewModelProvider instance is created via a call to the ViewModelProviders.of() (**DEPRECATED**) method.

When called, the method is passed a reference to the current Fragment or Activity and returns a ViewModelProvider instance. Once the ViewModelProvider instance has been created, the get() method can be called on that instance passing through the class of spcific ViewModel that is required.

With access to the model view, code can now be added to the Fragment to begin working with the data model.

The onClick property of the Button is used to designate the method to be called when the button is clicked by the user. Unfortunately, this property is only able to call methods on an activity and cannot be used to call a method in a Fragmet. To get around this limitation, we will need to add som code to the Fragment class to set up an onClick listnener on the button.


### MainVieModel
The ViewModel for the activity (MainActivity.kt). This is declared as a subclass of the ViewModel android architecture component class, and is ready to be modified to store the data model for the app. The data model for the app is created within the view model.


## Litterature
Android Studio 3.5 Development Essentials - Kotlin Edition: Developing Android 10 (Q) Apps Using Android Studio 3.5 - Chapter 39
