RecyclerView Demo Application
This application demonstrates how to use a RecyclerView to display a long list of scrolling words. It includes the following features:

Clicking on a word marks it as selected.
A Floating Action Button (FAB) allows adding new words to the list.
Summary
RecyclerView is an efficient way to display a scrolling list of items in Android applications. Here are the key concepts to understand when working with RecyclerView:

Efficient List Display
RecyclerView efficiently displays a list of elements that can be scrolled.
Adapter and Layout
The Adapter is responsible for inflating an XML layout resource for each list item using LayoutInflater.
Layout Managers
LinearLayoutManager: Displays items in a vertically or horizontally scrolling list.
GridLayoutManager: Displays items in a grid.
StaggeredGridLayoutManager: Displays items in a staggered grid.
Connecting Data
Use RecyclerView.Adapter to connect your data to the RecyclerView.
The adapter prepares the data in a RecyclerView.ViewHolder, which describes a view item and its position.
Item Clicks
Implement View.OnClickListener to detect clicks on the RecyclerView items.
Learn More
Here are additional resources to help you deepen your understanding of Android development and RecyclerView:

Android Studio Documentation:

Android Studio User Guide
Create App Icons with Image Asset Studio
Android Developer Documentation:

RecyclerView
LayoutInflater
LinearLayoutManager
GridLayoutManager
StaggeredGridLayoutManager
CoordinatorLayout
ConstraintLayout
RecyclerView.Adapter
RecyclerView.ViewHolder
View.OnClickListener
Create a list with RecyclerView
Video:

RecyclerView Animations and Behind the Scenes (Android Dev Summit 2015)
