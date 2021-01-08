
package org.demo

def checkout(git_url,branch) {
  echo git_url;
  echo branch;
  //git url: "$git_url" , branch:"$branch"
  echo "harsha"
}

def intialize(nodeOs,repo)
{
  if(nodeOs=="windows")
  {
    bat 'git init'
  }
  else
  {
    sh 'git status'
  }
}

    
