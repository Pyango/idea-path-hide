package org.jetbrains.plugins.template.services

import com.intellij.openapi.project.Project
import com.intellij.openapi.util.registry.Registry

class MyProjectService(project: Project) {

    init {
        Registry.get("project.tree.structure.show.url").setValue(false)
    }
}
