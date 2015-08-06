

# Introduction #
This tutorial will introduce you to the KnitML Pattern Editor 0.4.0 and will describe how to get around.

# Getting Around the Editor #
Across the top of the editor is the menu bar, with the following menus:
  * File (for opening, closing, importing / exporting files)
  * Edit (copy, paste, find / replace)
  * Search (for more powerful find / replace)
  * Preferences (to adjust pattern rendering preferences)
  * Help (to open up the Welcome screen, consult the help topics, or to see information about the product)

There are two main windows in the editor: the Project Explorer and the main window. You can think of the Project Explorer much like you would a file system window (Finder on Mac, Windows Explorer on Windows) and the main window where you work on the pattern itself.

In the Project Explorer window, there are projects and there are files. Projects are like knitting projects: they hold a collection of files related to knitting a particular pattern. The most important file is the pattern itself (with the .kel2 file extension), but there may be other supporting files in a project as well (such as images, property files for multiple languages, a different sized pattern).

# Installing an Example #
We recommend that you start by installing one or more sample patterns or demonstrations that are available. They illustrate various types of patterns and how they're constructed. Between them, they show how to specify all of the supported knitting operations.

You can install examples in two different ways:
  * from the welcome screen (available the first time you run the editor)
  * by selecting File -> New -> Example...

Select the example you want, click Next, then Finish. You'll see the example installed in the editor. If you don't have other patterns open, the editor will open the example as well. (If you want to manually open it, double-click the folder in the Project Explorer window on the left to open the project, then double-click on the file ending with kel2.)

There are two types of examples: demonstrations and sample patterns. Demonstrations are simply demonstrating a concept using instructions in the header of the pattern; they aren't real patterns that produce a finished object when knit. Pattern examples are real patterns (however basic), some of which are derivations of real, published patterns.

# Working with Patterns #
NOTE: when this guide describes control sequences (such as Control-Shift-F), on Macintosh these map to the "command" key.

Each pattern has a structure. It reads like a real pattern, with information about the pattern at the top and the directions written below. Inform

## Folding ##
This structure helps the editor to understand how to group certain elements defined in your pattern. You can fold up sections you're not interested in viewing by clicking on the + / - icons (with the little circles around them) on the left side of the pattern.

## Formatting ##
Control-Shift-F will format the pattern with indentation and spacing which reflects the pattern's structure.

## Suggestions ##
If you're not sure what to type next, try typing Control-Space anywhere in the pattern. This will give you (hopefully) appropriate suggestions where your cursor is located. Keep in mind this is an area of development, so many of the suggestions may not be optimized yet.

## Errors ##
If the editor doesn't understand the pattern, you'll get one or more red X marks with a circle in them down the left side of the text area. If you move your mouse over one of these marks, a little bubble will pop up with description of the error. If a light bulb appears underneath the red X, the editor has some suggestions for fixing the error. You can click on the light bulb and select a suggestion (if appropriate).

Some errors, such as syntax errors, occur as you type. Some errors (such as errors that occur when test knitting the pattern) occur only when you save the pattern.

## Keystrokes ##
These are common among many text editors.
Control-S: save the pattern
Control-F: find / replace
Control-C: copy
Control-X: cut
Control-V: paste
Right click (a.k.a. secondary click): pop-up menu with additional options

# Elements of a Pattern #
This section has moved [here](PatternElements.md).