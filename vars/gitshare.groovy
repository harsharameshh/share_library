#!/usr/bin/env groovy

package org.demo
def call(String git_url,String gitbranch,String credentialsId,String stage ) {
  
  def myUtils = new myUtils()
   myUtils.checkout(git_url,gitbranch)
    
}
