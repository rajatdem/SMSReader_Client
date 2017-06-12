#!/bin/bash

echo "\n\nInitializing Git Repo"
myvar=$1
regex="https://github.com/([^/]+)/([^/]+)"
githubId=""

length=${#myvar}

if [[ $myvar =~ $regex ]]; then
    githubId=${BASH_REMATCH[1]}
    echo "Github ID: "$githubId
    echo "Repo Name: " ${BASH_REMATCH[2]}
else
    echo "[ERROR]: Enter the correct Github Repo URL"
    exit 0
fi

git init 
echo "[Local Repo]: Initialized"

git remote add origin $1
echo "[Remote Repo]: Added"

git pull origin master
echo "[Git]: pull from remote Completed"

git add . 
echo "\n\n[Git]: add Completed"

git commit -m "[$githubId] Init Commit"
echo "[Git]: commit Complteted"

git push origin master
echo "[Git]: push to remote"
