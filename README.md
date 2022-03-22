# YRAP - your routines and projects

## Overview

**This project was one I was working on while learning Kotlin.  For the time being,
I've put that on hold, but I'm sure I'll pick it up in the future again**.

This project aims to combine a simple implementation of GTD, along with an approach to mastering routines.

## Projects

### Code:

There is a main Project class.

### Contexts

* Different situations, such as "on the train to London", so that we can assign an action to one or multiple contexts.
  It allows filtering by context when we want to know what to work on.

### Actions

* The action (a string of what we're working on)
* Added - a date when we added this action to the project
* An action belongs to a project
* State - in week (through weekly review), done, or none
* isNextAction - is it the next action we should take
* Context(s), there can be multiple - see contexts...

### Done When

* A string, indicating what condition will be met when this project is done

### Started

* A date, null until we start the project, of when we started

### Done

* A date, null until the project is done, marking when it was done

### State

* Created
* Active
* Someday/Maybe
* Done
* Stop (no longer working on)

## Weekly Review

* Updated once a week
* Review what was done in the last week.
* Add Actions to the next week.
* This isn't just the next action for a project, but the full set of actions I hope to tackle in a week.
* Some projects may not be included at all, some may have several of their actions included.

## Routines

* There are sets of routines, they can be whole day or simply a portion of a day
* They might be used with timers, or might now.
* They should be tracked - so you know each time you went through each routine
* You should be able to use a routine within another one, for example, I might have
  a monday routine that includes my train trip to commute to London, and my work, etc.  But I
  might have some kind of study program that runs while I'm on the train.  Running that shouldn't
  affect the fact that I'm already within a routine.
* I should be able to abort or use portions of a routine.  Useful for unexpected disruptions.
* Routines should be added either as templates or as one off.
* There should be data about templates, for example, all the times i completed any specific routine.
* Routines should have checkboxes
* It is useful if routines can be used to follow the 4dx principles, giving a compelling score card.


## Main Screens/Windows needed

* A main screen, with menus to lead to projects, routines, and weekly review
* A main projects page, with links to the list of projects
* A single project, it should allow me to hit edit to edit main parts, or
  link to actions that exist, and a simple add action page.  It should highlight the next action
* The add action page
* A weekly page, should show me the actions and their projects for this week's focus.
* The weekly page should be able to be reset, automatically or by clicking a button,
  and then there needs to be a page for the following week, where I can add actions from projects
  one by one.
* TODO: what routines pages do I need.

## Data

* The data should be fetched from a outside api connected with an api.  I need to build in security for this, such as using an api key for the call.
* The api calls should return JSON.
* Build the api with Django Rest Framework.
* Use user authentication for the rest framework calls.
