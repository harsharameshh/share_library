
package org.demo

def checkout(nodeOs,git_url,branch) {
  echo git_url;
  echo branch;
  git url: "$git_url" , branch:"$branch"
  
}

def intialize(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git init'
  }
  else
  {
    sh 'git init'
  }
}

def status(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git status'
  }
  else
  {
    sh 'git status'
  }
}

def newbranch(nodeOs,git_url,branch)
{
  echo '"$branch"';
  if(nodeOs=="windows")
  {
    
    bat 'git branch "$branch" '
  }
  else
  {
    sh 'git branch "$branch"'
  }
}
  def branchcheckout(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git checkout "$branch" '
  }
  else
  {
    sh 'git checkout "$branch"'
  }
}  
def add(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git add '
  }
  else
  {
    sh 'git add'
  }
} 
def commit(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git commit -m "added from git" '
  }
  else
  {
    sh 'git add -m "added from git"'
  }
} 

def pull(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git pull '
  }
  else
  {
    sh 'git pull'
  }
} 
def fetch(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git fetch '
  }
  else
  {
    sh 'git fetch'
  }
} 
def push(nodeOs,git_url,branch)
{
  if(nodeOs=="windows")
  {
    bat 'git push -origin "$git_url" "$branch" '
  }
  else
  {
    sh 'git push -origin "$git_url" "$branch" '
  }
} 
