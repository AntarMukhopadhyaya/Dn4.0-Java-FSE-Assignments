# Git Ignore Exercise

## Objective
The purpose of this exercise is to understand how to use the `.gitignore` file in a Git repository to ignore unwanted files and folders.  
Specifically, we will:
- Explain what `.gitignore` does.
- Demonstrate ignoring `.log` files and a `log/` folder.

## What is `.gitignore`?
The `.gitignore` file tells Git which files or directories to **ignore** when tracking changes in a repository.  
Ignored files are **not** staged, committed, or pushed to a remote repository.

Typical uses for `.gitignore` include:
- Temporary files created by the OS or editor.
- Log files.
- Build output files.
- Sensitive configuration files.



**Summary**
In this Exercise:

- We created unwanted files (debug.log, log/test.log) in our Git repository.

- We configured .gitignore to ignore all .log files and the log directory.

- We verified .gitignore was working using both git status and git check-ignore.

- We committed only the .gitignore file to the repository.

**Result**:
Log files and folders are successfully ignored by Git, keeping the repository clean and free of unnecessary file
