package com.github.j147258f.myideafirstplugin.services

import com.intellij.openapi.project.Project
import com.github.j147258f.myideafirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
