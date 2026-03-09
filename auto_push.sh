#!/bin/bash

BRANCH="main"

while true
do
echo "--------------------------------"
echo "Auto pushing..."
echo "Time: $(date)"
echo "--------------------------------"

# Remove compiled Java files automatically
find . -name "*.class" -type f -delete

# Remove cached class files if tracked
git rm --cached *.class 2>/dev/null

# Add files
git add .

# Commit with timestamp
git commit -m "Auto update $(date '+%Y-%m-%d %H:%M:%S')" || echo "No changes to commit"

# Push to GitHub
git push origin $BRANCH

echo "Next push in 30 minutes..."

sleep 10 # Sleep for 30 minutes (1800 seconds)
done