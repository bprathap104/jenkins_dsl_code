job('first_seed'){
   stages{
     stage('checkout'){
       steps {
         scm {
           git {
             remote {
               url('https://github.com/bprathap104/jenkins_dsl_code.git')
             }
             branch('master')
           }
         }
      }
    }
  }
}