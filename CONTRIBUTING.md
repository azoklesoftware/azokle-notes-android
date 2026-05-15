# Contributing to Azokle Notes

First off, thank you for considering contributing to Azokle Notes! It's people like you that make Azokle Notes such a great tool for everyone.

## Where do I go from here?

If you've noticed a bug or have a feature request, make sure to check our [Issues](https://github.com/azoklesoftware/azokle-notes-android/issues) to see if someone else in the community has already created a ticket. If not, go ahead and [make one](https://github.com/azoklesoftware/azokle-notes-android/issues/new/choose)!

## Fork & create a branch

If this is something you think you can fix, then fork Azokle Notes and create a branch with a descriptive name.

A good branch name would be (where issue #325 is the ticket you're working on):

```sh
git checkout -b 325-add-dark-mode-toggle
```

## Get the test suite running

Make sure you're using Android Studio. Import the project using `build.gradle.kts`. Run the app to ensure your development environment is correctly set up.

## Implement your fix or feature

At this point, you're ready to make your changes! Feel free to ask for help; everyone is a beginner at first :smile_cat:

## Formatting and Code Style

* We use Kotlin for all new code.
* Please ensure your code follows standard Kotlin coding conventions.
* For UI components, adhere to Material Design 3 (Material You) guidelines where possible.

## Make a Pull Request

At this point, you should switch back to your master branch and make sure it's up to date with Azokle Notes' master branch:

```sh
git remote add upstream git@github.com:azoklesoftware/azokle-notes-android.git
git checkout master
git pull upstream master
```

Then update your feature branch from your local copy of master, and push it!

```sh
git checkout 325-add-dark-mode-toggle
git rebase master
git push --set-upstream origin 325-add-dark-mode-toggle
```

Finally, go to GitHub and [make a Pull Request](https://github.com/azoklesoftware/azokle-notes-android/compare) :D

## Need help?

If you need any help, please don't hesitate to reach out to us at support@azokle.com or start a Discussion on GitHub.
