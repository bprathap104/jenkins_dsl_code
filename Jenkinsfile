node('master'){
  stage('checkout'){
    git branch: 'master', url: 'https://github.com/bprathap104/jenkins_dsl_code.git'
  }
  stage('update_seed_job'){
    echo 'Go go go'
    sh 'pwd'
    sh 'ls'
    sh 'cat Jenkinsfile'
    sh 'git branch'
    jobDsl sandbox: true, targets: 'seed/first.groovy'
  }
  stage('build_seed_job'){
    build 'first_seed'
  }
}
