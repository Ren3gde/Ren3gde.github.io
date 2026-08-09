---
layout: default
title: Ren3gde's homepage
description: Bookmark this to keep an eye on my project updates!
---

<!-- Video Background Setup -->
<div class="video-bg-container">
  <video autoplay loop muted playsinline class="video-bg">
    <source src="/backgrounds.mp4" type="video/mp4">
  </video>
</div>

[About Me](/) | [Software Design](/Software-Design-and-Engineering) | [Algorithms](/Algorithms-and-Data-Structure) | [Databases](/Databases)

---

<style>
/* Locks video to full browser viewport dimensions */
.video-bg-container {
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  z-index: -1;
  overflow: hidden;
}

/* Stretches and crops video cleanly without squishing */
.video-bg {
  min-width: 100%;
  min-height: 100%;
  width: auto;
  height: auto;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  object-fit: cover;
  opacity: 0.55; /* Lowers brightness so text remains legible */
}

/* Strips out layout block colors to make background visible */
body, .wrapper, header, section, footer {
  background: transparent !important;
}
</style>
