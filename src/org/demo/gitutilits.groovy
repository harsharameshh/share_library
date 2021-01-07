
package org.demo

def checkout(git_url,branch) {
  git url: "git_url" , branch:"branch"
}

def intialize(nodeOs,repo)
{
  if(nodOs='windows')
  {
    bat 'git init'
  }
  else
  {
    sh 'git status'
  }
}

    
