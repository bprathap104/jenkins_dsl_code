job('just_echoing'){
  steps {
    shell('echo "my love"')
  }
}
job('just_cat'){
  git 'https://github.com/bprathap104/jenkins_dsl_code.git'
  steps {
    shell('cat Jenkinsfile')
  }
}
