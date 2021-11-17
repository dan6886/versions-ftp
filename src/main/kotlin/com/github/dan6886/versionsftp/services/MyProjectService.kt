package com.github.dan6886.versionsftp.services

import com.intellij.openapi.project.Project
import com.github.dan6886.versionsftp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
