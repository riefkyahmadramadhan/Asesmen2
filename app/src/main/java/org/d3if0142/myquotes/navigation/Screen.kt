package org.d3if0142.myquotes.navigation

import org.d3if0142.myquotes.ui.screen.KEY_ID_BUKU


sealed class Screen (val route: String){
    data object Home: Screen("mainscreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_BUKU}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}