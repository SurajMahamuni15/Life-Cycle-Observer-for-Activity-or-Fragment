package com.example.lifecycleobserver

import android.app.Activity
import android.content.pm.PackageManager
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment


fun Fragment.toastMessage(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
}

fun Activity.toastMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun View.setHide() {
    this.visibility = View.GONE
}

fun View.setShow() {
    this.visibility = View.VISIBLE
}

fun Activity.checkPermission(permissionsList: List<String>) {
    val arrayList = ArrayList<String>()
    permissionsList.forEach {
        if (checkSelfPermission(it) == PackageManager.PERMISSION_DENIED) {
            arrayList.add(it)
        }
    }
    requestPermissions(arrayList.toTypedArray(), 112)
}