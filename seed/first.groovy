job('first_seed'){
  scm {
    git {
      remote {
        url('https://github.com/bprathap104/jenkins_dsl_code.git')
      }
      branch('master')
    }
  }
  steps {
    shell {
      command(String ls)
    }
  }
}
