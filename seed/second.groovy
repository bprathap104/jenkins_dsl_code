job('just_echoing'){
  steps {
    shell('echo "my love"')
  }
}
job('just_cat'){
  scm {
    git {
      remote {
        url('https://github.com/bprathap104/jenkins_dsl_code.git')
      }
      branch('master')
    }
  }
  steps {
    shell('cat Jenkinsfile')
  }
}
