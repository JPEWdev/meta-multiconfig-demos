SUMMARY = "Reports the current dreamer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

INHIBIT_DEFAULT_DEPS = "1"

do_install() {
    install -d ${D}${sysconfdir}
    echo "${DREAMER}" > ${D}${sysconfdir}/dreamer.conf
}

FILES_${PN} = "${sysconfdir}/dreamer.conf"
