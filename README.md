# RecyclerView

This project demonstrates how to use a **RecyclerView** in an Android application to display a scrolling list of words.

## Features
- Touching a word marks it as clicked.
- Adding new words by touching the Floating Action Button (FAB).

## Key Concepts

### 1. Efficient List Display
- **RecyclerView** efficiently displays a list of elements that can be scrolled.

### 2. Adapter and Layout
- The **Adapter** inflates an XML layout for each list item using `LayoutInflater`.

### 3. Layout Managers
- **LinearLayoutManager**: Displays items in a vertically or horizontally scrolling list.
- **GridLayoutManager**: Displays items in a grid layout.
- **StaggeredGridLayoutManager**: Displays items in a staggered grid layout.

### 4. Connecting Data
- The **RecyclerView.Adapter** connects your data to the **RecyclerView**.
- It uses a **RecyclerView.ViewHolder** to describe the item view and its position.

### 5. Handling Click Events
- **View.OnClickListener** is implemented to handle click actions on each item.

## Additional Resources
To learn more about RecyclerView and its components, check out the following resources:
- [Android Developer: RecyclerView](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView)
- [LinearLayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/LinearLayoutManager)
- [GridLayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/GridLayoutManager)
- [StaggeredGridLayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/StaggeredGridLayoutManager)
- [View.OnClickListener](https://developer.android.com/reference/android/view/View.OnClickListener)
