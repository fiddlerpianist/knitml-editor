If you want the latest and greatest updates to the KnitML Core Tools without having to wait for the next version of KnitML Pattern Editor, this document tells you what you need to do.

# Instructions #
  * Download the snapshot update from this site. Click on the "Downloads" tab and find the latest one. They are not platform dependent, which means that it does not matter whether you are running Windows, Mac OS, or Linux. The snapshot update will work for all of them.
  * Unzip the downloaded file into _KnitML Pattern Editor Home_/plugins, where _KnitML Pattern Editor Home_ is where you originally installed the KnitML Pattern Editor. For example, if you installed the Pattern Editor into C:\gpec-0.2.1, unzip the snapshot update into C:\gpec-0.2.0\plugins.
  * The next time you run the editor, run it with the -clean option. You can do this by either creating a shortcut from the executable file and adding the "-clean" option to it, or by opening a shell window in the editor's home directory and running it by typing:
```
  knitmlEditor -clean
```
  * Note: for Mac OS, you need to navigate to the knitmlEditor.app/Contents/MacOS directory to execute the clean command:
```
  MyComputer:gpec-0.2.1 fiddlerpianist$ cd knitmlEditor.app/Contents/MacOS/
  MyComputer:MacOS fiddlerpianist$ ./knitmlEditor -clean
```


You only need to do this once.

Note that all snapshot updates for KnitML Pattern Editor 0.2.0 have been deprecated in favor of downloading KnitML Pattern Editor 0.2.1.