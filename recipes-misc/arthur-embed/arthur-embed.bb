SUMMARY = "Arthur Image"
LICENSE = "MIT"
DEPENDS = ""
LIC_FILES_CHKSUM = "file://${WORKDIR}/run-arthur;beginline=2;endline=20;md5=04cb488e2ccd1325045a1b39852a7faa"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "file://run-arthur"

do_install() {
    install -d ${D}/usr/share/arthur
    install \
        ${TOPDIR}/tmp-arthur/deploy/images/qemux86-64/bzImage \
        ${TOPDIR}/tmp-arthur/deploy/images/qemux86-64/arthur-image-qemux86-64.ext4 \
        ${D}/usr/share/arthur/

    install -d ${D}${bindir}
    install -m 755 ${WORKDIR}/run-arthur ${D}${bindir}
}

do_install[mcdepends] = "mc:cobb:arthur:arthur-image:do_image_complete"

FILES_${PN} = "/usr/share/arthur ${bindir}/run-arthur"

