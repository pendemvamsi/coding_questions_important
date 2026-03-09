#!/bin/bash

# ================================
# Auto GitHub Push Every 30 Minutes
# ================================

REPO_URL="https://github.com/pendemvamsi/coding_questions_important.git"
BRANCH="master"

# First-time setup (runs only once)
if [ ! -d ".git" ]; then
    echo "Initializing repository..."
    git init
    git branch -M $BRANCH
    git remote add origin $REPO_URL
fi

while true
do
    echo "--------------------------------"
    echo "Auto pushing to GitHub..."
    echo "Time: $(date)"
    echo "--------------------------------"

    git add .

    git commit -m "Auto update $(date '+%Y-%m-%d %H:%M:%S')" || echo "No changes to commit"

    git push -u origin $BRANCH

    echo "Next push in 30 minutes..."
    
    sleep 1800
done