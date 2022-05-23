package org.jetbrains.plugins.template.services

import org.jetbrains.plugins.template.MyBundle

class MyApplicationService {

    init {
        System.setProperty("-Dproject.tree.structure.show.url", "false");
        System.setProperty("project.tree.structure.show.url", "false");
        println(MyBundle.message("applicationService"))
    }
}
