@Library('sayHello_lib@master')_
// pipeline{
//     agent any
//     stages{
//         stage("check shared lib"){
//           steps{
//               echo "checkkingg.."
//               sayHello
//           }
//         }
//     }
// }

// pipeline{
//     agent any
//     stages{
//         stage('Demo') {
//             steps{
//              echo 'Hello world'
//              sayHello 'Student'
//             }
//          }
//     }
// }



//  stage('Demo') {
//      echo 'Hello world'
//      sayHello 'Dave'
//  }
properties([parameters([choice(choices: ['Student', 'Other'], name: 'Name')])])
sayHello '$Name'


