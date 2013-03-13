SUMMARY = "Preware is a webOS on-device homebrew installer."
SECTION = "webos/apps"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb723b61539feef013de476e68b5c50a"

inherit webos_public_repo
inherit webos_arch_indep
inherit enyojs_application
inherit cordova_application

PV = "2.0.0+gitr${SRCPV}"
PR = "r0"

SRCREV = "a38a3ba2ba7a71eaed38ca51069d6bb82d07b0d2"
SRC_URI = "git://github.com/webOS-ports/preware;protocol=git;branch=master"
S = "${WORKDIR}/git"
