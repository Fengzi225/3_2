---
name: Replit console Run setup
description: A reliable Run-button setup for short-lived console programs.
---

For simple console programs that compile and exit, use the top-level `.replit` `run` command and select “Run Replit App” rather than creating a separate workflow.

**Why:** A custom workflow was removed when the Run-button selection was rewritten, while the direct run command remained configured and executable.

**How to apply:** Put the compile-and-run shell command in `.replit` `run` for short-lived console apps. Use a workflow only when the process needs workflow lifecycle management.
