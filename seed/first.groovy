job('first_seed'){
  steps {
    scm {
      git {
        remote {
          url('https://github.com/bprathap104/jenkins_dsl_code.git')
        }
        branch('master')
      }
    }
    dsl {
      text(readFileFromWorkspace('seed/second.groovy'))
      removeAction('DELETE')
    }
  }
}
