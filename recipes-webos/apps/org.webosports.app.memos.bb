SUMMARY = "Memos app re-written from scratch for Open webOS"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit webos_public_repo
inherit webos_arch_indep
inherit enyojs_application

PV = "1.0.6+gitr${SRCPV}"
PR = "r1"

SRCREV = "86c4e33ff7e51e80845fb564ba0e0ea99cae818d"
SRC_URI = "git://github.com/webOS-ports/${PN};protocol=git"
S = "${WORKDIR}/git"
