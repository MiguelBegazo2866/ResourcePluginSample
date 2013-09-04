modules = {
    application {
        resource url:'js/application.js'
    }

    myCustomModule {
        dependsOn 'jquery'

        resource url:'/js/utils.js'
    }
}