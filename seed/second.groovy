job('just_echoing'){
  steps {
    shell('echo "my love"')
  }
}
job('just_cat'){
  steps {
    shell('cat Jenkinsfile')
  }
}
